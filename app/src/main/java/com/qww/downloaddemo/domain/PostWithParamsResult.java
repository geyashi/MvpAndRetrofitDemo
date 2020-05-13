package com.qww.downloaddemo.domain;

import java.util.List;

public class PostWithParamsResult {

    @Override
    public String toString() {
        return "PostWithParamsResult{" +
                "showapi_res_code=" + showapi_res_code +
                ", showapi_res_error='" + showapi_res_error + '\'' +
                ", showapi_res_id='" + showapi_res_id + '\'' +
                ", showapi_res_body=" + showapi_res_body +
                '}';
    }

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_id : ce135f6739294c63be0c021b76b6fbff
     * showapi_res_body : {"ret_code":0,"pagebean":{"allPages":1813,"contentlist":[{"weight":44,"imgList":["http://img04.taobaocdn.com/imgextra/i4/1587435156/T1QsNsFHdcXXXXXXXX_!!1587435156-2-tstar.png","http://img02.taobaocdn.com/imgextra/i2/1070000210/TB1BzDiHVXXXXaOXVXXXXXXXXXX_!!1070000210-0-tstar.jpg_620x10000.jpg"],"height":162,"totalFavorNum":0,"link":"http://mm.taobao.com/self/aiShow.htm?userId=913319362","userId":"913319362","avatarUrl":"http://gtd.alicdn.com/sns_logo/i2/TB1sBnUHVXXXXXOXVXXSutbFXXX.jpg","realName":"秋景HuHu","type":"欧美","totalFanNum":23,"cardUrl":"","city":"杭州市"}],"currentPage":1,"allNum":36255,"maxResult":20}}
     */

    private int showapi_res_code;
    private String             showapi_res_error;
    private String             showapi_res_id;
    private ShowapiResBodyBean showapi_res_body;

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public String getShowapi_res_id() {
        return showapi_res_id;
    }

    public void setShowapi_res_id(String showapi_res_id) {
        this.showapi_res_id = showapi_res_id;
    }

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyBean {

        @Override
        public String toString() {
            return "ShowapiResBodyBean{" +
                    "ret_code=" + ret_code +
                    ", pagebean=" + pagebean +
                    '}';
        }

        /**
         * ret_code : 0
         * pagebean : {"allPages":1813,"contentlist":[{"weight":44,"imgList":["http://img04.taobaocdn.com/imgextra/i4/1587435156/T1QsNsFHdcXXXXXXXX_!!1587435156-2-tstar.png","http://img02.taobaocdn.com/imgextra/i2/1070000210/TB1BzDiHVXXXXaOXVXXXXXXXXXX_!!1070000210-0-tstar.jpg_620x10000.jpg"],"height":162,"totalFavorNum":0,"link":"http://mm.taobao.com/self/aiShow.htm?userId=913319362","userId":"913319362","avatarUrl":"http://gtd.alicdn.com/sns_logo/i2/TB1sBnUHVXXXXXOXVXXSutbFXXX.jpg","realName":"秋景HuHu","type":"欧美","totalFanNum":23,"cardUrl":"","city":"杭州市"}],"currentPage":1,"allNum":36255,"maxResult":20}
         */

        private int ret_code;
        private PagebeanBean pagebean;

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public PagebeanBean getPagebean() {
            return pagebean;
        }

        public void setPagebean(PagebeanBean pagebean) {
            this.pagebean = pagebean;
        }

        public static class PagebeanBean {

            @Override
            public String toString() {
                return "PagebeanBean{" +
                        "allPages=" + allPages +
                        ", currentPage=" + currentPage +
                        ", allNum=" + allNum +
                        ", maxResult=" + maxResult +
                        ", contentlist=" + contentlist +
                        '}';
            }

            /**
             * allPages : 1813
             * contentlist : [{"weight":44,"imgList":["http://img04.taobaocdn.com/imgextra/i4/1587435156/T1QsNsFHdcXXXXXXXX_!!1587435156-2-tstar.png","http://img02.taobaocdn.com/imgextra/i2/1070000210/TB1BzDiHVXXXXaOXVXXXXXXXXXX_!!1070000210-0-tstar.jpg_620x10000.jpg"],"height":162,"totalFavorNum":0,"link":"http://mm.taobao.com/self/aiShow.htm?userId=913319362","userId":"913319362","avatarUrl":"http://gtd.alicdn.com/sns_logo/i2/TB1sBnUHVXXXXXOXVXXSutbFXXX.jpg","realName":"秋景HuHu","type":"欧美","totalFanNum":23,"cardUrl":"","city":"杭州市"}]
             * currentPage : 1
             * allNum : 36255
             * maxResult : 20
             */

            private int allPages;
            private int                   currentPage;
            private int                   allNum;
            private int                   maxResult;
            private List<ContentlistBean> contentlist;

            public int getAllPages() {
                return allPages;
            }

            public void setAllPages(int allPages) {
                this.allPages = allPages;
            }

            public int getCurrentPage() {
                return currentPage;
            }

            public void setCurrentPage(int currentPage) {
                this.currentPage = currentPage;
            }

            public int getAllNum() {
                return allNum;
            }

            public void setAllNum(int allNum) {
                this.allNum = allNum;
            }

            public int getMaxResult() {
                return maxResult;
            }

            public void setMaxResult(int maxResult) {
                this.maxResult = maxResult;
            }

            public List<ContentlistBean> getContentlist() {
                return contentlist;
            }

            public void setContentlist(List<ContentlistBean> contentlist) {
                this.contentlist = contentlist;
            }

            public static class ContentlistBean {

                @Override
                public String toString() {
                    return "ContentlistBean{" +
                            "weight=" + weight +
                            ", height=" + height +
                            ", totalFavorNum=" + totalFavorNum +
                            ", link='" + link + '\'' +
                            ", userId='" + userId + '\'' +
                            ", avatarUrl='" + avatarUrl + '\'' +
                            ", realName='" + realName + '\'' +
                            ", type='" + type + '\'' +
                            ", totalFanNum=" + totalFanNum +
                            ", cardUrl='" + cardUrl + '\'' +
                            ", city='" + city + '\'' +
                            ", imgList=" + imgList +
                            '}';
                }

                /**
                 * weight : 44
                 * imgList : ["http://img04.taobaocdn.com/imgextra/i4/1587435156/T1QsNsFHdcXXXXXXXX_!!1587435156-2-tstar.png","http://img02.taobaocdn.com/imgextra/i2/1070000210/TB1BzDiHVXXXXaOXVXXXXXXXXXX_!!1070000210-0-tstar.jpg_620x10000.jpg"]
                 * height : 162
                 * totalFavorNum : 0
                 * link : http://mm.taobao.com/self/aiShow.htm?userId=913319362
                 * userId : 913319362
                 * avatarUrl : http://gtd.alicdn.com/sns_logo/i2/TB1sBnUHVXXXXXOXVXXSutbFXXX.jpg
                 * realName : 秋景HuHu
                 * type : 欧美
                 * totalFanNum : 23
                 * cardUrl :
                 * city : 杭州市
                 */

                private String       weight;
                private String       height;
                private String       totalFavorNum;
                private String       link;
                private String       userId;
                private String       avatarUrl;
                private String       realName;
                private String       type;
                private String       totalFanNum;
                private String       cardUrl;
                private String       city;
                private List<String> imgList;

                public String getWeight() {
                    return weight;
                }

                public void setWeight(String weight) {
                    this.weight = weight;
                }

                public String getHeight() {
                    return height;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public String getTotalFavorNum() {
                    return totalFavorNum;
                }

                public void setTotalFavorNum(String totalFavorNum) {
                    this.totalFavorNum = totalFavorNum;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }

                public String getUserId() {
                    return userId;
                }

                public void setUserId(String userId) {
                    this.userId = userId;
                }

                public String getAvatarUrl() {
                    return avatarUrl;
                }

                public void setAvatarUrl(String avatarUrl) {
                    this.avatarUrl = avatarUrl;
                }

                public String getRealName() {
                    return realName;
                }

                public void setRealName(String realName) {
                    this.realName = realName;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getTotalFanNum() {
                    return totalFanNum;
                }

                public void setTotalFanNum(String totalFanNum) {
                    this.totalFanNum = totalFanNum;
                }

                public String getCardUrl() {
                    return cardUrl;
                }

                public void setCardUrl(String cardUrl) {
                    this.cardUrl = cardUrl;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public List<String> getImgList() {
                    return imgList;
                }

                public void setImgList(List<String> imgList) {
                    this.imgList = imgList;
                }
            }
        }
    }
}
