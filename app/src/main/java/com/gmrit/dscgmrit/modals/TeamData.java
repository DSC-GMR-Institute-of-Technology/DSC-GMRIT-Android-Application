package com.gmrit.dscgmrit.modals;

import java.util.List;

public class TeamData {


    /**
     * status : true
     * data : [{"member_id":"dsc_01","member_name":"Mr. Koushik Modekurti","member_photo_url":"https://dscgmrit.herokuapp.com/admin/team/koushik_modekurti.jpg","member_designation":"DSC Lead","member_department":"4th IT","member_interests":"Android,Data Analyst, Firebase, Backend Development, Cloud Computing, Web Development, AWS","member_email":"koushikmodekurti00@gmail.com","phone_number":"+91 8639796138","github_profile":"https://github.com/Koushik15042000","instagram_profile":"https://www.instagram.com/__sai_koushik__/","linkedin_profile":"https://www.linkedin.com/in/koushik-modekurti-6b0b46150/","member_photo":"koushik_modekurti.jpg"},{"member_id":"dsc_02","member_name":"Mr. T. Chandra Sekhar Reddy","member_photo_url":"https://dscgmrit.herokuapp.com/admin/team/chandra_sekhar_sir.jpeg","member_designation":"Faculty Advisor","member_department":"Dept. of IT","member_interests":"RPA, Big Data Analytics, Hadoop Programming","member_email":"chandrasekhar.t@gmrit.edu.in","phone_number":"+91 9849183145","github_profile":"NA","instagram_profile":"https://www.instagram.com/chandu.tummuru/","linkedin_profile":"https://www.linkedin.com/in/chandrasekhara-reddy-tummuru-362449191/","member_photo":"chandra_sekhar_sir.jpeg"},{"member_id":"dsc_03","member_name":"Mr. Santosh Burada","member_photo_url":"https://dscgmrit.herokuapp.com/admin/team/santosh_burada.jpg","member_designation":"Android Developer","member_department":"4th IT","member_interests":"Adnroid, Python, Web Development, OpenCV, Java, ML","member_email":"santu.burada99@gmail.com","phone_number":"+91 6303149161","github_profile":"https://github.com/santosh-burada","instagram_profile":"https://www.instagram.com/santuburada1999/","linkedin_profile":"https://www.linkedin.com/in/santosh-burada-1171881aa/","member_photo":"santosh_burada.jpg"},{"member_id":"dsc_04","member_name":"Mr. Vinay Sriram","member_photo_url":"https://dscgmrit.herokuapp.com/admin/team/vinay_sriram.jpg","member_designation":" Web Developer","member_department":"2nd IT","member_interests":"Web Development","member_email":"vinaysriramtummidi01@gmail.com","phone_number":"+91 8688486699","github_profile":"https://github.com/vinaysriram01","instagram_profile":"https://www.instagram.com/sriram_vinay/","linkedin_profile":"https://www.linkedin.com/in/vinay-sriram-3692141b6/","member_photo":"vinay_sriram.jpg"},{"member_id":"dsc_05","member_name":"Mr. Saikiran Kopparthi","member_photo_url":"https://dscgmrit.herokuapp.com/admin/team/IMG_5257.jpg","member_designation":"Android Developer","member_department":"3rd IT","member_interests":"Machine Learning, Android App Development, Firebase, REST API, Web Development, PHP, jQuery","member_email":"knvrssaikiran@gmail.com","phone_number":"+91 9381384234","github_profile":"","instagram_profile":"https://www.instagram.com/kirankkd12/","linkedin_profile":"https://www.linkedin.com/in/saikiran-kopparthi-2204a518a/","member_photo":"IMG_5257.jpg"},{"member_id":"dsc_06","member_name":"Ms. Juhi Siri Sai Jasti","member_photo_url":"https://dscgmrit.herokuapp.com/admin/team/juhi_siri_sai_jasti.jpeg","member_designation":"Media & Creatives","member_department":"4th CSE","member_interests":"Creativity, Graphic Design","member_email":"juhisirisai@gmail.com","phone_number":"+919494913736","github_profile":"NA","instagram_profile":"https://www.instagram.com/juhi_jasti/","linkedin_profile":"https://www.linkedin.com/in/juhijasti2414/","member_photo":"juhi_siri_sai_jasti.jpeg"},{"member_id":"dsc_07","member_name":"Mr. Sai Teja Vankayala","member_photo_url":"https://dscgmrit.herokuapp.com/admin/team/saiteja_vankayala.jpeg","member_designation":"Full Stack Developer","member_department":"4th CSE","member_interests":"Web Development, React, Django, REST API","member_email":"saitejavankayala5@gmail.com","phone_number":"+91 9182661299","github_profile":"https://github.com/saitejavankayala","instagram_profile":"https://www.instagram.com/saitejavankayala/","linkedin_profile":"https://www.linkedin.com/in/vankayala-sai-teja-507114152/","member_photo":"saiteja_vankayala.jpeg"},{"member_id":"dsc_08","member_name":"Mr. Venkatesh Muvvala","member_photo_url":"https://dscgmrit.herokuapp.com/admin/team/venkatesh_muvvala.jpeg","member_designation":"IoT Developer","member_department":"4th ECE","member_interests":"Cyber Security, AWS, Game Development, HTML, CSS, IoT, Robotics","member_email":"muvvalavenkatesh99@gmail.com","phone_number":"+91 9121979986","github_profile":"NA","instagram_profile":"https://www.instagram.com/venkatesh_muvvala/","linkedin_profile":"https://www.linkedin.com/in/venkatesh-muvvala-287150177/","member_photo":"venkatesh_muvvala.jpeg"}]
     */

    private boolean status;
    private List<DataBean> data;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * member_id : dsc_01
         * member_name : Mr. Koushik Modekurti
         * member_photo_url : https://dscgmrit.herokuapp.com/admin/team/koushik_modekurti.jpg
         * member_designation : DSC Lead
         * member_department : 4th IT
         * member_interests : Android,Data Analyst, Firebase, Backend Development, Cloud Computing, Web Development, AWS
         * member_email : koushikmodekurti00@gmail.com
         * phone_number : +91 8639796138
         * github_profile : https://github.com/Koushik15042000
         * instagram_profile : https://www.instagram.com/__sai_koushik__/
         * linkedin_profile : https://www.linkedin.com/in/koushik-modekurti-6b0b46150/
         * member_photo : koushik_modekurti.jpg
         */

        private String member_id;
        private String member_name;
        private String member_photo_url;
        private String member_designation;
        private String member_department;
        private String member_interests;
        private String member_email;
        private String phone_number;
        private String github_profile;
        private String instagram_profile;
        private String linkedin_profile;
        private String member_photo;

        public String getMember_id() {
            return member_id;
        }

        public void setMember_id(String member_id) {
            this.member_id = member_id;
        }

        public String getMember_name() {
            return member_name;
        }

        public void setMember_name(String member_name) {
            this.member_name = member_name;
        }

        public String getMember_photo_url() {
            return member_photo_url;
        }

        public void setMember_photo_url(String member_photo_url) {
            this.member_photo_url = member_photo_url;
        }

        public String getMember_designation() {
            return member_designation;
        }

        public void setMember_designation(String member_designation) {
            this.member_designation = member_designation;
        }

        public String getMember_department() {
            return member_department;
        }

        public void setMember_department(String member_department) {
            this.member_department = member_department;
        }

        public String getMember_interests() {
            return member_interests;
        }

        public void setMember_interests(String member_interests) {
            this.member_interests = member_interests;
        }

        public String getMember_email() {
            return member_email;
        }

        public void setMember_email(String member_email) {
            this.member_email = member_email;
        }

        public String getPhone_number() {
            return phone_number;
        }

        public void setPhone_number(String phone_number) {
            this.phone_number = phone_number;
        }

        public String getGithub_profile() {
            return github_profile;
        }

        public void setGithub_profile(String github_profile) {
            this.github_profile = github_profile;
        }

        public String getInstagram_profile() {
            return instagram_profile;
        }

        public void setInstagram_profile(String instagram_profile) {
            this.instagram_profile = instagram_profile;
        }

        public String getLinkedin_profile() {
            return linkedin_profile;
        }

        public void setLinkedin_profile(String linkedin_profile) {
            this.linkedin_profile = linkedin_profile;
        }

        public String getMember_photo() {
            return member_photo;
        }

        public void setMember_photo(String member_photo) {
            this.member_photo = member_photo;
        }
    }
}
