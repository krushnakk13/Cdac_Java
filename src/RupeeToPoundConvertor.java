
public class RupeeToPoundConvertor implements CurrencyConvertor {

	@Override
	public float doConvert(float amount) {
		
		// TODO Auto-generated method stub
		float amountInPounds = amount / POUND_TO_RUPEE;
		return amountInPounds;
	}

}
