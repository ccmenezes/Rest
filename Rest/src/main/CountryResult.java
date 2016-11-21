/**
 * 21 de nov de 2016
 * @Author Danilo Zagato
 * danilo.zagato@cognizant.com
 */
package main;

/**
 * @author 609855
 *
 */
public class CountryResult {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlpha2_code() {
		return alpha2_code;
	}
	public void setAlpha2_code(String alpha2_code) {
		this.alpha2_code = alpha2_code;
	}
	public String getAlpha3_code() {
		return alpha3_code;
	}
	public void setAlpha3_code(String alpha3_code) {
		this.alpha3_code = alpha3_code;
	}
	private String name;
	private String alpha2_code;
	private String alpha3_code;
}
