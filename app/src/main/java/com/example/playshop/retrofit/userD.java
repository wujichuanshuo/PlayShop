package com.example.playshop.retrofit;

public class userD {

    /**
     * nameValuePairs : {"username":"1","userpassword":"2"}
     */

    private NameValuePairsBean nameValuePairs;

    public NameValuePairsBean getNameValuePairs() {
        return nameValuePairs;
    }

    public void setNameValuePairs(NameValuePairsBean nameValuePairs) {
        this.nameValuePairs = nameValuePairs;
    }

    public static class NameValuePairsBean {
        /**
         * username : 1
         * userpassword : 2
         */

        private String username;
        private String userpassword;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getUserpassword() {
            return userpassword;
        }

        public void setUserpassword(String userpassword) {
            this.userpassword = userpassword;
        }
    }
}
