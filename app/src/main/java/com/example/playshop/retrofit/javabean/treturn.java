package com.example.playshop.retrofit.javabean;

public class treturn {
    /**
     * nameValuePairs : {"age":"9.0000000000","pass":"1"}
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
         * age : 9.0000000000
         * pass : 1
         */

        private String age;
        private String pass;

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getPass() {
            return pass;
        }

        public void setPass(String pass) {
            this.pass = pass;
        }
    }
}
