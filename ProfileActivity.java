package com.example.orkatrade;

import static android.app.Activity.RESULT_OK;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

import com.example.orkatrade.ui.ProfileDatabase;

import java.io.File;

public class ProfileActivity extends ProfileDatabase {

    public ProfileActivity(Context context) {
        super(context);
    }

    public static byte[] getName() {
        return new byte[0];
    }

    public static byte[] getMoney() {
        return new byte[0];
    }

    public static class UserProfile {
        private String name;
        private double money;
        // Add more fields as needed (e.g., email, password, etc.)

        public UserProfile(String name, double money) {
            this.name = name;
            this.name =  last
            this.money = money;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getMoney() {
            return money;
        }

        public void setMoney(double money) {
            this.money = money;
        }
    }
    private static final int REQUEST_IMAGE_SELECT = 101;

    public void selectProfilePicture(View view) {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, REQUEST_IMAGE_SELECT);
    }

    private void startActivityForResult(Intent intent, int requestImageSelect) {
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE_SELECT && resultCode == RESULT_OK && data != null) {
            Uri selectedImageUri = data.getData();
            String selectedImagePath = getPathFromUri(selectedImageUri);
            // Store the selected image (see Step 4)
            storeProfilePicture(selectedImagePath);
        }
    }

    private void storeProfilePicture(String selectedImagePath) {

    }

    private String getPathFromUri(Uri uri) {
        String[] projection = {MediaStore.Images.Media.DATA};
        Cursor cursor = getContentResolver().query(uri, projection, null, null, null);
        if (cursor != null) {
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex(projection[0]);
            String imagePath = cursor.getString(columnIndex);
            cursor.close();
            return imagePath;
        }
        return null;
    }

    private Uri.Builder getContentResolver() {
        return null;
    }
    private void loadProfilePicture() {
        File imageFile = new File(getFilesDir(), "profile_picture.jpg");
        if (imageFile.exists()) {
            Bitmap bitmap = BitmapFactory.decodeFile(imageFile.getAbsolutePath());
            ImageView profilePictureImageView = profilePictureImageView.findViewById();
            profilePictureImageView.setImageBitmap(bitmap);
        }
    }

    private File getFilesDir() {
        return null;
    }

}
