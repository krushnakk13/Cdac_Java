
public class CurrencyConvertorMain {
	public static void main(String[] args) {
		System.out.println("Today's Exchange rate");
		System.out.println("USD TO INR "+CurrencyConvertor.DOLLAR_TO_RUPEE);
		
		
		CurrencyConvertor convertor;
		 convertor = new DollerToRupeeConvertor();
		 float rupees = convertor.doConvert(5000);
		 System.out.println("$5000 = Rs." +rupees);
		 System.out.println("====================");
		 
		 convertor = new RupeeToPoundConvertor();
		 float pounds = convertor.doConvert(15000000);
		 System.out.println("Rs. 15000000 = GBP. "+pounds);
	}

}

interface manualTest{}
interface AutomationTest{}
interface UatTest{}
