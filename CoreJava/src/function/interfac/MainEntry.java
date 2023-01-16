package function.interfac;

public class MainEntry {
	Calc<Integer> add = new Calc<>() {

		@Override
		public Integer compute(Integer[] arr) {
			Integer[] arr1 = {10,20,30,40,50};
			int addres = 0;
			for (int i = 0; i<= arr1.length; i++) {
				addres = addres + arr1[i];
			}
			return addres;
		}

	};
	
	Calc<Integer> subtract = new Calc<>() {

		@Override
		public Integer compute(Integer[] arr) {
			int subres = 0;
			for (int i = 0; i<= arr.length; i++) {
				subres = arr[i] - subres;
			}
			return subres;
		}
		
	};
	
	Calc<Integer> multiply = new Calc<>() {

		@Override
		public Integer compute(Integer[] arr) {
			int mulres = 1;
			for (int i = 0; i<= arr.length; i++) {
				mulres = mulres * arr[i];
			}
			return mulres;
		}
		
	};
	
	Calc<Integer> divide = new Calc<>() {

		@Override
		public Integer compute(Integer[] arr) {
			int divres = 1;
			for (int i = 0; i<= arr.length; i++) {
				divres =  arr[i] / divres;
			}
			return divres;
		}
		
	};

}