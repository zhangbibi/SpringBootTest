package com.freebird.common.wxpay;

import com.threeguys.common.util.LogUtils;
import com.threeguys.common.util.PropertiesUtils;
import org.slf4j.Logger;

import java.util.UUID;

/**
 * 微信支付-企业付款接口参数
 * @author zhangyaping
 */
public class CompanyPayParams {

	private static Logger logger = LogUtils.getLogger();

	private String mch_appid;
	private String mchid;
	private String nonce_str;
	private String partner_trade_no;
	private String openid;
	private String check_name;
	private String re_user_name;
	private String amount;
	private String desc;
	private String spbill_create_ip;
	private String sign;

	public CompanyPayParams() {
			this.mch_appid = PropertiesUtils.getPropertyValues("wx.appId");
			this.mchid = PropertiesUtils.getPropertyValues("wx.mch_id");
			this.nonce_str = UUID.randomUUID().toString().replace("-", "");
			this.check_name = "NO_CHECK";
			//this.desc = "Withdrawal success from Zhidao!";
			this.desc = "Congratulations.";
			this.spbill_create_ip = ip();
	}

	private String ip() {
	    try {
//			return InetAddress.getLocalHost().getHostAddress().toString();
            return "119.29.235.96";
		} catch (Exception e) {
			logger.error("获取本机ip异常.", e);
			return "";
		}
	}

	public String getMch_appid() {
		return mch_appid;
	}
	public void setMch_appid(String mch_appid) {
		this.mch_appid = mch_appid;
	}
	public String getMchid() {
		return mchid;
	}
	public void setMchid(String mchid) {
		this.mchid = mchid;
	}
	public String getNonce_str() {
		return nonce_str;
	}
	public void setNonce_str(String nonce_str) {
		this.nonce_str = nonce_str;
	}
	public String getPartner_trade_no() {
		return partner_trade_no;
	}
	public void setPartner_trade_no(String partner_trade_no) {
		this.partner_trade_no = partner_trade_no;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getCheck_name() {
		return check_name;
	}
	public void setCheck_name(String check_name) {
		this.check_name = check_name;
	}
	public String getRe_user_name() {
		return re_user_name;
	}
	public void setRe_user_name(String re_user_name) {
		this.re_user_name = re_user_name;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getSpbill_create_ip() {
		return spbill_create_ip;
	}
	public void setSpbill_create_ip(String spbill_create_ip) {
		this.spbill_create_ip = spbill_create_ip;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	@Override
	public String toString() {
		return "CompanyPayParams [mch_appid=" + mch_appid + ", mchid=" + mchid + ", nonce_str=" + nonce_str
				+ ", partner_trade_no=" + partner_trade_no + ", openid=" + openid + ", check_name=" + check_name
				+ ", re_user_name=" + re_user_name + ", amount=" + amount + ", desc=" + desc + ", spbill_create_ip="
				+ spbill_create_ip + ", sign=" + sign + "]";
	}

}
