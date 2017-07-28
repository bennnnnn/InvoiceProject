package invoice;

public class ProductClass {
	 
		
		private String productDesc;
		private double productPrice;
		private double taxRate;
		
		
		public ProductClass(String productDesc, double productPrice, double taxRate) {
			super();
			this.productDesc = productDesc;
			this.productPrice = productPrice;
			this.taxRate = taxRate;
		}
		
		
		public String getProductDesc() {
			return productDesc;
		}
		public void setProductDesc(String productDesc) {
			this.productDesc = productDesc;
		}
		
		public double getProductPrice() {
			return productPrice;
		}
		
		public void setProductPrice(double productPrice) {
			this.productPrice = productPrice;
		}
		
		public double getTaxRate() {
			return taxRate;
		}
		
		public void setTaxRate(double taxRate) {
			this.taxRate = taxRate;
		}


		 
		
	}


