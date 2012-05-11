package com.opentravelsoft.entity;

// Generated 2012-5-9 8:27:00 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ProductItem generated by hbm2java
 */
@Entity
@Table(name = "tbl_product_item", catalog = "tourismwork_db")
public class ProductItem implements java.io.Serializable {

	private Integer itemId;
	private int catId;
	private String itemCode;
	private String itemName;
	private int sortOrder;
	private byte isActive;
	private byte showInPortal;
	private byte isTmpl;
	private byte isText;
	private byte hasTitle;
	private byte systemList;
	private String linkUrl;

	public ProductItem() {
	}

	public ProductItem(int catId, String itemCode, String itemName,
			int sortOrder, byte isActive, byte showInPortal, byte isTmpl,
			byte isText, byte hasTitle, byte systemList) {
		this.catId = catId;
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.sortOrder = sortOrder;
		this.isActive = isActive;
		this.showInPortal = showInPortal;
		this.isTmpl = isTmpl;
		this.isText = isText;
		this.hasTitle = hasTitle;
		this.systemList = systemList;
	}

	public ProductItem(int catId, String itemCode, String itemName,
			int sortOrder, byte isActive, byte showInPortal, byte isTmpl,
			byte isText, byte hasTitle, byte systemList, String linkUrl) {
		this.catId = catId;
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.sortOrder = sortOrder;
		this.isActive = isActive;
		this.showInPortal = showInPortal;
		this.isTmpl = isTmpl;
		this.isText = isText;
		this.hasTitle = hasTitle;
		this.systemList = systemList;
		this.linkUrl = linkUrl;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ITEM_ID", unique = true, nullable = false)
	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	@Column(name = "CAT_ID", nullable = false)
	public int getCatId() {
		return this.catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	@Column(name = "ITEM_CODE", nullable = false, length = 50)
	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	@Column(name = "ITEM_NAME", nullable = false, length = 50)
	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Column(name = "SORT_ORDER", nullable = false)
	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	@Column(name = "IS_ACTIVE", nullable = false)
	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	@Column(name = "SHOW_IN_PORTAL", nullable = false)
	public byte getShowInPortal() {
		return this.showInPortal;
	}

	public void setShowInPortal(byte showInPortal) {
		this.showInPortal = showInPortal;
	}

	@Column(name = "IS_TMPL", nullable = false)
	public byte getIsTmpl() {
		return this.isTmpl;
	}

	public void setIsTmpl(byte isTmpl) {
		this.isTmpl = isTmpl;
	}

	@Column(name = "IS_TEXT", nullable = false)
	public byte getIsText() {
		return this.isText;
	}

	public void setIsText(byte isText) {
		this.isText = isText;
	}

	@Column(name = "HAS_TITLE", nullable = false)
	public byte getHasTitle() {
		return this.hasTitle;
	}

	public void setHasTitle(byte hasTitle) {
		this.hasTitle = hasTitle;
	}

	@Column(name = "SYSTEM_LIST", nullable = false)
	public byte getSystemList() {
		return this.systemList;
	}

	public void setSystemList(byte systemList) {
		this.systemList = systemList;
	}

	@Column(name = "LINK_URL", length = 200)
	public String getLinkUrl() {
		return this.linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

}