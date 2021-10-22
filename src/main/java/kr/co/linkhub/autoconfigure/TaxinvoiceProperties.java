package kr.co.linkhub.autoconfigure;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "popbill.taxinvoice")
public class TaxinvoiceProperties {
	private static final Log logger = LogFactory.getLog(TaxinvoiceProperties.class);
	
	TaxinvoiceProperties (){
		logger.debug("test");
	}
	
	private String linkid;
	private String secretkey;
	private boolean isTest;
	private boolean usestaticiP;
	private boolean usegaip;
	private boolean uselocaltimeyn;
	private boolean iprestrectonoff;
	
	public String getLinkid() {
		return linkid;
	}
	public void setLinkid(String linkid) {
		this.linkid = linkid;
	}
	public String getSecretkey() {
		return secretkey;
	}
	public void setSecretkey(String secretkey) {
		this.secretkey = secretkey;
	}
	public boolean isTest() {
		return isTest;
	}
	public void setTest(boolean isTest) {
		this.isTest = isTest;
	}
	public boolean isUsestaticiP() {
		return usestaticiP;
	}
	public void setUsestaticiP(boolean usestaticiP) {
		this.usestaticiP = usestaticiP;
	}
	public boolean isUsegaip() {
		return usegaip;
	}
	public void setUsegaip(boolean usegaip) {
		this.usegaip = usegaip;
	}
	public boolean isUselocaltimeyn() {
		return uselocaltimeyn;
	}
	public void setUselocaltimeyn(boolean uselocaltimeyn) {
		this.uselocaltimeyn = uselocaltimeyn;
	}
	public boolean isIprestrectonoff() {
		return iprestrectonoff;
	}
	public void setIprestrectonoff(boolean iprestrectonoff) {
		this.iprestrectonoff = iprestrectonoff;
	}
	
	
	
}
