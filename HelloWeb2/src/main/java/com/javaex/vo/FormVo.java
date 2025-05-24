package com.javaex.vo;

//form에 제출한 data를 담는 Value Object 클래스

public class FormVo {

	private String user_id;                  // 사용자 ID
    private String user_name;                // 이름
    private String email;                   // 이메일
    private String phone_number;            // 휴대폰 번호
    private String password;                // 비밀번호
    private String product_type;             // 제품 타입
    private String order_quantity;           // 주문 수량
    private String privacy_agreement;        // 개인정보 동의
    private String service_agreement;        // 서비스 이용약관 동의
    private String marketing_email_agreement; // 마케팅 이메일 동의

    // 기본 생성자
    public FormVo() {}

    //JSP에서 사용하기 위한 생성자 (String 매개변수)
    public FormVo(String userId, String name, String email, String phone, String password, 
                  String productType, String orderQuantity, String privacyAgreement, 
                  String serviceAgreement, String marketingEmailAgreement) {
        this.user_id = userId;
        this.user_name = name;
        this.email = email;
        this.phone_number = phone;
        this.password = password;
        this.product_type = productType;
        this.order_quantity = orderQuantity;
        this.privacy_agreement = privacyAgreement;
        this.service_agreement = serviceAgreement;
        this.marketing_email_agreement = marketingEmailAgreement;
    }

    // Getter 메서드
    public String getUserId() {
        return user_id;
    }

    public String getName() {
        return user_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone_number;
    }

    public String getPassword() {
        return password;
    }

    public String getProductType() {
        return product_type;
    }

    public String getOrderQuantity() {
        return order_quantity;
    }

    public String getPrivacyAgreement() {
        return privacy_agreement;
    }

    public String getServiceAgreement() {
        return service_agreement;
    }

    public String getMarketingEmailAgreement() {
        return marketing_email_agreement;
    }

    // Setter 메서드
    public void setUserId(String userId) {
        this.user_id = userId;
    }

    public void setName(String name) {
        this.user_name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone_number = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setProductType(String productType) {
        this.product_type = productType;
    }

    public void setOrderQuantity(String orderQuantity) {
        this.order_quantity = orderQuantity;
    }

    public void setPrivacyAgreement(String privacyAgreement) {
        this.privacy_agreement = privacyAgreement;
    }

    public void setServiceAgreement(String serviceAgreement) {
        this.service_agreement = serviceAgreement;
    }

    public void setMarketingEmailAgreement(String marketingEmailAgreement) {
        this.marketing_email_agreement = marketingEmailAgreement;
    }


    // 편의 메서드: 동의 여부를 boolean으로 반환
    public boolean isPrivacyAgreed() {
        return "on".equals(privacy_agreement) || "true".equals(privacy_agreement);
    }

    public boolean isServiceAgreed() {
        return "on".equals(service_agreement) || "true".equals(service_agreement);
    }

    public boolean isMarketingEmailAgreed() {
        return "on".equals(marketing_email_agreement) || "true".equals(marketing_email_agreement);
    }

    // 수량을 정수로 반환하는 편의 메서드
    public int getQuantityAsInt() {
        try {
            return Integer.parseInt(order_quantity);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    // toString 메서드 (디버깅용)
    @Override
    public String toString() {
        return "FormVo{" +
                ", userId='" + user_id + '\'' +
                ", name='" + user_name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone_number + '\'' +
                ", productType='" + product_type + '\'' +
                ", orderQuantity='" + order_quantity + '\'' +
                ", privacyAgreement='" + privacy_agreement + '\'' +
                ", serviceAgreement='" + service_agreement + '\'' +
                ", marketingEmailAgreement='" + marketing_email_agreement + '\'' +
        //        ", registrationDate=" + registrationDate +
                '}';
    }
}
    