package com.solvd.lab.automation.v2.mybatis.model;

public class Url {

    private String base;
    private boolean useUtc;
    private boolean useTimeShift;

    private Url(String base) {
        this.base = base;
    }

    static class Builder {
        private String base;
        private boolean useUtc;
        private boolean useTimeShift;

        public Builder(String base) {
            this.base = base;
        }

        public Builder useUtc(boolean useUtc) {
            this.useUtc = useUtc;
            return this;
        }

        public Builder useTimeShift(boolean useTimeShift) {
            this.useTimeShift = useTimeShift;
            return this;
        }

        public Url build() {
            Url url = new Url(this.base);
            url.useTimeShift = this.useTimeShift;
            url.useUtc = this.useUtc;
            return url;
        }
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public boolean isUseUtc() {
        return useUtc;
    }

    public void setUseUtc(boolean useUtc) {
        this.useUtc = useUtc;
    }

    public boolean isUseTimeShift() {
        return useTimeShift;
    }

    public void setUseTimeShift(boolean useTimeShift) {
        this.useTimeShift = useTimeShift;
    }

    @Override
    public String toString() {
        String returnValue = base;
        if (useUtc ) {
            if (base.endsWith("lib")) {
                returnValue += "?";
            } else {
                returnValue += "&";
            }
            returnValue += "useUtc=" + useUtc;
        }
        if (useTimeShift) {
            if (useUtc) {
                returnValue += "&";
            } else {
                returnValue += "?";
            }
            returnValue += "useTimeShift=" + useTimeShift;
        }
        return returnValue;
    }
}
