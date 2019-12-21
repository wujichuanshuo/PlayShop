package com.example.playshop.retrofit.javabean;

public class member {
    /**
     * nameValuePairs : {"dh":"18595060000","dz":"湖南工学院","sj":"2019-11-16 03:23:23","xm":"罗罗","yj":"50"}
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
         * dh : 18595060000
         * dz : 湖南工学院
         * sj : 2019-11-16 03:23:23
         * xm : 罗罗
         * yj : 50
         */

        private String dh;
        private String dz;
        private String sj;
        private String xm;
        private String yj;

        public String getDh() {
            return dh;
        }

        public void setDh(String dh) {
            this.dh = dh;
        }

        public String getDz() {
            return dz;
        }

        public void setDz(String dz) {
            this.dz = dz;
        }

        public String getSj() {
            return sj;
        }

        public void setSj(String sj) {
            this.sj = sj;
        }

        public String getXm() {
            return xm;
        }

        public void setXm(String xm) {
            this.xm = xm;
        }

        public String getYj() {
            return yj;
        }

        public void setYj(String yj) {
            this.yj = yj;
        }
    }
}
