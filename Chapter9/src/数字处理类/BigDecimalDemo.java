package 数字处理类;

import java.math.BigDecimal;

/**
 * BigDecimal
 * @author nelson
 *
 */
public class BigDecimalDemo {
	static final int location =10;
	public BigDecimal add(double value1,double value2) {
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.add(b2);
	}
	public BigDecimal sub(double value1,double value2) {
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.subtract(b2);
	}
	public BigDecimal mul(double value1,double value2) {
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.multiply(b2);
	}
	public BigDecimal div(double value1,double value2) {
		return div(value1,value2,location);
	}
	public BigDecimal div(double value1,double value2,int b) {
		if(b<0)
			System.out.println("b的值必须大于0");
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.divide(b2,b,BigDecimal.ROUND_HALF_UP);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimalDemo b = new BigDecimalDemo();
		System.out.println("-7.5 + 8.9"+b.add(-7.5, 8.9));
		System.out.println("-7.5 - 8.9"+b.sub(-7.5, 8.9));
		System.out.println("-7.5 * 8.9"+b.mul(-7.5, 8.9));
		System.out.println("10 / 2"+b.div(10, 2));
		System.out.println("-7.5 / 8.9"+b.div(-7.5, 8.9,5));
		
		
		
	}

}
