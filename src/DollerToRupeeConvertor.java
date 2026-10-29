
public class DollerToRupeeConvertor implements CurrencyConvertor {

	@Override
	public float doConvert(float amount) {
		
		// TODO Auto-generated method stub
		float amountInRupees = amount *DOLLAR_TO_RUPEE;
		return amountInRupees;
	}

}
