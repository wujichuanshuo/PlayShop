package com.example.playshop.retrofit.javabean;

public class login {
    /**
     * nameValuePairs : {"pass":"1"}
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
         * pass : 1
         */

        private String pass;

        public String getPass() {
            return pass;
        }

        public void setPass(String pass) {
            this.pass = pass;
        }
    }
}
