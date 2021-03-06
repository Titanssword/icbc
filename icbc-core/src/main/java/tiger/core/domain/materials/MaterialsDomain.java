/**
 * Gambition Inc.
 * All Right Reserved.
 */
package tiger.core.domain.materials;

import tiger.core.domain.BaseDomain;

/**
 * @Author: [mondooo.cgq]
 * @version: [V 0.1.1]
 * @CreateDate: [2016/12/8 08:09]
 */
public class MaterialsDomain extends BaseDomain{

    /**
     * 物料编码
     *
     * @mbggenerated
     */
    private String code;

    /**
     * 物料名称
     */
    private String name;

    /**
     * 物料描述
     *
     * @mbggenerated
     */
    private String description;

    /**
     * 大类
     *
     * @mbggenerated
     */
    private String majorcategory;

    /**
     * 中类
     *
     * @mbggenerated
     */
    private String subcategory;

    /**
     * 明细类
     *
     * @mbggenerated
     */
    private String detailclass;

    /**
     * 生产公司
     *
     * @mbggenerated
     */
    private String company;

    /**
     * 产品线
     *
     * @mbggenerated
     */
    private String productline;

    /**
     * 面价
     *
     * @mbggenerated
     */
    private Double marketprice;

    /**
     * 折扣
     *
     * @mbggenerated
     */
    private Double discount;

    /**
     * 折扣后价格
     */
    private Double discountprice;

    /**
     * 备注
     */
    private String remarks;

    public Double getDiscountprice() {
        return discountprice;
    }

    public void setDiscountprice(Double discountprice) {
        this.discountprice = discountprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materials.id
     *
     * @return the value of materials.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materials.id
     *
     * @param id the value for materials.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materials.code
     *
     * @return the value of materials.code
     *
     * @mbggenerated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materials.code
     *
     * @param code the value for materials.code
     *
     * @mbggenerated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materials.description
     *
     * @return the value of materials.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materials.description
     *
     * @param description the value for materials.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materials.majorcategory
     *
     * @return the value of materials.majorcategory
     *
     * @mbggenerated
     */
    public String getMajorcategory() {
        return majorcategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materials.majorcategory
     *
     * @param majorcategory the value for materials.majorcategory
     *
     * @mbggenerated
     */
    public void setMajorcategory(String majorcategory) {
        this.majorcategory = majorcategory == null ? null : majorcategory.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materials.subcategory
     *
     * @return the value of materials.subcategory
     *
     * @mbggenerated
     */
    public String getSubcategory() {
        return subcategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materials.subcategory
     *
     * @param subcategory the value for materials.subcategory
     *
     * @mbggenerated
     */
    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory == null ? null : subcategory.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materials.detailclass
     *
     * @return the value of materials.detailclass
     *
     * @mbggenerated
     */
    public String getDetailclass() {
        return detailclass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materials.detailclass
     *
     * @param detailclass the value for materials.detailclass
     *
     * @mbggenerated
     */
    public void setDetailclass(String detailclass) {
        this.detailclass = detailclass == null ? null : detailclass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materials.company
     *
     * @return the value of materials.company
     *
     * @mbggenerated
     */
    public String getCompany() {
        return company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materials.company
     *
     * @param company the value for materials.company
     *
     * @mbggenerated
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materials.productline
     *
     * @return the value of materials.productline
     *
     * @mbggenerated
     */
    public String getProductline() {
        return productline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materials.productline
     *
     * @param productline the value for materials.productline
     *
     * @mbggenerated
     */
    public void setProductline(String productline) {
        this.productline = productline == null ? null : productline.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materials.marketprice
     *
     * @return the value of materials.marketprice
     *
     * @mbggenerated
     */
    public Double getMarketprice() {
        return marketprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materials.marketprice
     *
     * @param marketprice the value for materials.marketprice
     *
     * @mbggenerated
     */
    public void setMarketprice(Double marketprice) {
        this.marketprice = marketprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materials.discount
     *
     * @return the value of materials.discount
     *
     * @mbggenerated
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materials.discount
     *
     * @param discount the value for materials.discount
     *
     * @mbggenerated
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
