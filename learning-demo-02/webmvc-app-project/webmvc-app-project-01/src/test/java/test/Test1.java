package test;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-12 23:35
 */

public class Test1 {
    @Test
    void t1() {

    }

    public static class AA {

        /**
         * code : 200
         * data : {"contents":[{"createTime":"2020-01-12 16:14:54","createUser":"","enabled":0,"id":1216272322865008640,"nickName":"string","password":"string","realName":"string","updateTime":"2020-01-12 16:14:53","updateUser":"","username":"string"},{"createTime":"2020-01-12 16:15:05","createUser":"","enabled":0,"id":1216272370336141312,"nickName":"string","password":"string","realName":"string","updateTime":"2020-01-12 16:15:04","updateUser":"","username":"string"},{"createTime":"2020-01-12 16:15:06","createUser":"","enabled":0,"id":1216272376187195392,"nickName":"string","password":"string","realName":"string","updateTime":"2020-01-12 16:15:06","updateUser":"","username":"string"},{"createTime":"2020-01-12 16:15:07","createUser":"","enabled":0,"id":1216272380536688640,"nickName":"string","password":"string","realName":"string","updateTime":"2020-01-12 16:15:07","updateUser":"","username":"string"},{"createTime":"2020-01-12 16:15:08","createUser":"","enabled":0,"id":1216272384718409728,"nickName":"string","password":"string","realName":"string","updateTime":"2020-01-12 16:15:08","updateUser":"","username":"string"},{"createTime":"2020-01-12 22:46:53","createUser":"","enabled":0,"id":1216370969095049216,"nickName":"string","password":"aaa","realName":"string","updateTime":"2020-01-12 22:48:47","updateUser":"","username":"string1"},{"createTime":"2020-01-12 22:51:13","createUser":"","enabled":0,"id":1216372058645204992,"nickName":"string","password":"$2a$10$AjU7QL8o82OnS2yRYPTyoer6xX5m0w.22Y.64PDIdnTBGXXy3alXu","realName":"string","updateTime":"2020-01-12 22:51:38","updateUser":"","username":"string2"},{"createTime":"2020-01-12 22:53:56","createUser":"","enabled":0,"id":1216372742442586112,"nickName":"string","password":"$2a$10$y7TVcI.QKlhaxNr95dOZXOELWZ6TExcktAJPq8YIdFtPKO8A8k6Ca","realName":"string","updateTime":"2020-01-12 22:53:55","updateUser":"","username":"string3"},{"createTime":"2020-01-12 23:03:53","createUser":"","enabled":0,"id":1216375248287567872,"nickName":"string","password":"$2a$10$.d8YefQldDh7KuLUr.tQjeS/tBRodO/ZCt2uNjc.NgCFTVY0NUV/K","realName":"string","updateTime":"2020-01-12 23:03:53","updateUser":"","username":"string3"},{"createTime":"2020-01-12 23:05:08","createUser":"","enabled":0,"id":1216375561904066560,"nickName":"string","password":"$2a$10$t0vJfMcDvOlYGcyd6oMrKuWQTLxL0UWpTEb7a2BznEKJgBXOdkJVq","realName":"string","updateTime":"2020-01-12 23:05:07","updateUser":"","username":"string3"},{"createTime":"2020-01-12 23:08:43","createUser":"","enabled":0,"id":1216376465860464640,"nickName":"string","password":"$2a$10$efsGh13oirytz0jHIFHDhu7Am5yrDszURJkIPUoCuRBdkbyE.3eHq","realName":"string","updateTime":"2020-01-12 23:08:43","updateUser":"","username":"string3"},{"createTime":"2020-01-12 23:10:01","createUser":"","enabled":0,"id":1216376792370253824,"nickName":"string","password":"$2a$10$EdbqSHRul3cMglDFpcW6SebeBAUipOb404AMu2PpW.56ODeVrvbP6","realName":"string","updateTime":"2020-01-12 23:10:01","updateUser":"","username":"admin1"},{"createTime":"2020-01-12 23:11:57","createUser":"","enabled":0,"id":1216377276678148096,"nickName":"string","password":"$2a$10$fHH3rq1KrtWPJPBi0OFiWu4iqzUAKYkJ0IpQCR3QwsSst4522.Rue","realName":"string","updateTime":"2020-01-12 23:11:56","updateUser":"","username":"admin1"},{"createTime":"2020-01-12 23:12:35","createUser":"","enabled":0,"id":1216377438846717952,"nickName":"string","password":"$2a$10$TYRfk.0cuUMuBEB0oTUukOksXZarGJY01JFqzNBobCNAwkZvHOzie","realName":"string","updateTime":"2020-01-12 23:12:35","updateUser":"","username":"admin1"},{"createTime":"2020-01-12 23:12:36","createUser":"","enabled":0,"id":1216377442000834560,"nickName":"string","password":"$2a$10$JSUoOmeJ1vpfAuKFtaFWfe4p.ZtRJ65HamBXxoBwtcjAOvi39jXqu","realName":"string","updateTime":"2020-01-12 23:12:36","updateUser":"","username":"admin1"},{"createTime":"2020-01-12 23:12:37","createUser":"","enabled":0,"id":1216377444534194176,"nickName":"string","password":"$2a$10$Vjm7L9nLMVknnVY9KYtAsekZsXbHIDnparMBI4NP1gOq1b1RCbSqW","realName":"string","updateTime":"2020-01-12 23:12:36","updateUser":"","username":"admin1"}],"page":1,"size":16,"totalNumberOfRows":16,"totalPages":1}
         * message : 操作成功
         */

        private int code;
        private DataBean data;
        private String message;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public static class DataBean {
            /**
             * contents : [{"createTime":"2020-01-12 16:14:54","createUser":"","enabled":0,"id":1216272322865008640,"nickName":"string","password":"string","realName":"string","updateTime":"2020-01-12 16:14:53","updateUser":"","username":"string"},{"createTime":"2020-01-12 16:15:05","createUser":"","enabled":0,"id":1216272370336141312,"nickName":"string","password":"string","realName":"string","updateTime":"2020-01-12 16:15:04","updateUser":"","username":"string"},{"createTime":"2020-01-12 16:15:06","createUser":"","enabled":0,"id":1216272376187195392,"nickName":"string","password":"string","realName":"string","updateTime":"2020-01-12 16:15:06","updateUser":"","username":"string"},{"createTime":"2020-01-12 16:15:07","createUser":"","enabled":0,"id":1216272380536688640,"nickName":"string","password":"string","realName":"string","updateTime":"2020-01-12 16:15:07","updateUser":"","username":"string"},{"createTime":"2020-01-12 16:15:08","createUser":"","enabled":0,"id":1216272384718409728,"nickName":"string","password":"string","realName":"string","updateTime":"2020-01-12 16:15:08","updateUser":"","username":"string"},{"createTime":"2020-01-12 22:46:53","createUser":"","enabled":0,"id":1216370969095049216,"nickName":"string","password":"aaa","realName":"string","updateTime":"2020-01-12 22:48:47","updateUser":"","username":"string1"},{"createTime":"2020-01-12 22:51:13","createUser":"","enabled":0,"id":1216372058645204992,"nickName":"string","password":"$2a$10$AjU7QL8o82OnS2yRYPTyoer6xX5m0w.22Y.64PDIdnTBGXXy3alXu","realName":"string","updateTime":"2020-01-12 22:51:38","updateUser":"","username":"string2"},{"createTime":"2020-01-12 22:53:56","createUser":"","enabled":0,"id":1216372742442586112,"nickName":"string","password":"$2a$10$y7TVcI.QKlhaxNr95dOZXOELWZ6TExcktAJPq8YIdFtPKO8A8k6Ca","realName":"string","updateTime":"2020-01-12 22:53:55","updateUser":"","username":"string3"},{"createTime":"2020-01-12 23:03:53","createUser":"","enabled":0,"id":1216375248287567872,"nickName":"string","password":"$2a$10$.d8YefQldDh7KuLUr.tQjeS/tBRodO/ZCt2uNjc.NgCFTVY0NUV/K","realName":"string","updateTime":"2020-01-12 23:03:53","updateUser":"","username":"string3"},{"createTime":"2020-01-12 23:05:08","createUser":"","enabled":0,"id":1216375561904066560,"nickName":"string","password":"$2a$10$t0vJfMcDvOlYGcyd6oMrKuWQTLxL0UWpTEb7a2BznEKJgBXOdkJVq","realName":"string","updateTime":"2020-01-12 23:05:07","updateUser":"","username":"string3"},{"createTime":"2020-01-12 23:08:43","createUser":"","enabled":0,"id":1216376465860464640,"nickName":"string","password":"$2a$10$efsGh13oirytz0jHIFHDhu7Am5yrDszURJkIPUoCuRBdkbyE.3eHq","realName":"string","updateTime":"2020-01-12 23:08:43","updateUser":"","username":"string3"},{"createTime":"2020-01-12 23:10:01","createUser":"","enabled":0,"id":1216376792370253824,"nickName":"string","password":"$2a$10$EdbqSHRul3cMglDFpcW6SebeBAUipOb404AMu2PpW.56ODeVrvbP6","realName":"string","updateTime":"2020-01-12 23:10:01","updateUser":"","username":"admin1"},{"createTime":"2020-01-12 23:11:57","createUser":"","enabled":0,"id":1216377276678148096,"nickName":"string","password":"$2a$10$fHH3rq1KrtWPJPBi0OFiWu4iqzUAKYkJ0IpQCR3QwsSst4522.Rue","realName":"string","updateTime":"2020-01-12 23:11:56","updateUser":"","username":"admin1"},{"createTime":"2020-01-12 23:12:35","createUser":"","enabled":0,"id":1216377438846717952,"nickName":"string","password":"$2a$10$TYRfk.0cuUMuBEB0oTUukOksXZarGJY01JFqzNBobCNAwkZvHOzie","realName":"string","updateTime":"2020-01-12 23:12:35","updateUser":"","username":"admin1"},{"createTime":"2020-01-12 23:12:36","createUser":"","enabled":0,"id":1216377442000834560,"nickName":"string","password":"$2a$10$JSUoOmeJ1vpfAuKFtaFWfe4p.ZtRJ65HamBXxoBwtcjAOvi39jXqu","realName":"string","updateTime":"2020-01-12 23:12:36","updateUser":"","username":"admin1"},{"createTime":"2020-01-12 23:12:37","createUser":"","enabled":0,"id":1216377444534194176,"nickName":"string","password":"$2a$10$Vjm7L9nLMVknnVY9KYtAsekZsXbHIDnparMBI4NP1gOq1b1RCbSqW","realName":"string","updateTime":"2020-01-12 23:12:36","updateUser":"","username":"admin1"}]
             * page : 1
             * size : 16
             * totalNumberOfRows : 16
             * totalPages : 1
             */

            private int page;
            private int size;
            private int totalNumberOfRows;
            private int totalPages;
            private List<ContentsBean> contents;

            public int getPage() {
                return page;
            }

            public void setPage(int page) {
                this.page = page;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public int getTotalNumberOfRows() {
                return totalNumberOfRows;
            }

            public void setTotalNumberOfRows(int totalNumberOfRows) {
                this.totalNumberOfRows = totalNumberOfRows;
            }

            public int getTotalPages() {
                return totalPages;
            }

            public void setTotalPages(int totalPages) {
                this.totalPages = totalPages;
            }

            public List<ContentsBean> getContents() {
                return contents;
            }

            public void setContents(List<ContentsBean> contents) {
                this.contents = contents;
            }

            public static class ContentsBean {
                /**
                 * createTime : 2020-01-12 16:14:54
                 * createUser :
                 * enabled : 0
                 * id : 1216272322865008640
                 * nickName : string
                 * password : string
                 * realName : string
                 * updateTime : 2020-01-12 16:14:53
                 * updateUser :
                 * username : string
                 */

                private String createTime;
                private String createUser;
                private int enabled;
                private long id;
                private String nickName;
                private String password;
                private String realName;
                private String updateTime;
                private String updateUser;
                private String username;

                public String getCreateTime() {
                    return createTime;
                }

                public void setCreateTime(String createTime) {
                    this.createTime = createTime;
                }

                public String getCreateUser() {
                    return createUser;
                }

                public void setCreateUser(String createUser) {
                    this.createUser = createUser;
                }

                public int getEnabled() {
                    return enabled;
                }

                public void setEnabled(int enabled) {
                    this.enabled = enabled;
                }

                public long getId() {
                    return id;
                }

                public void setId(long id) {
                    this.id = id;
                }

                public String getNickName() {
                    return nickName;
                }

                public void setNickName(String nickName) {
                    this.nickName = nickName;
                }

                public String getPassword() {
                    return password;
                }

                public void setPassword(String password) {
                    this.password = password;
                }

                public String getRealName() {
                    return realName;
                }

                public void setRealName(String realName) {
                    this.realName = realName;
                }

                public String getUpdateTime() {
                    return updateTime;
                }

                public void setUpdateTime(String updateTime) {
                    this.updateTime = updateTime;
                }

                public String getUpdateUser() {
                    return updateUser;
                }

                public void setUpdateUser(String updateUser) {
                    this.updateUser = updateUser;
                }

                public String getUsername() {
                    return username;
                }

                public void setUsername(String username) {
                    this.username = username;
                }
            }
        }
    }
}