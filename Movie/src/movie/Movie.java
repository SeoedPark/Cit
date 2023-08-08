
	package movie;

	public class Movie {

		String movieName;
		int price;
		int age;
		int money;
		double rate;
		String way;

		public Movie(String movieName, int price, int age, String way) {
			this.movieName = movieName;
			this.price = price;
			this.age = age;
			this.way = way;
		}

		void rateCal() {
			switch (way) {
			case "인터넷":
				if (age < 20) {
					rate = (0.25 + 0.05);
					break;
				}
				else if (age >= 20 && age < 30) {
		
					rate = (0.20 + 0.05);
					break;
				}
				else {
					rate = (0.15 + 0.05);
					break;
				}

			case "현장":
				if (age < 20) {
					rate = 0.25;
					break;
				}
				else if (age >= 20 && age < 30) {
					rate = 0.20;
					break;
				}
				else {
					rate = 0.15;
					break;
				}

			case "쿠폰":
				if (age < 20) {
					rate = (0.25 + 0.10);
					break;
				}
				else if (age >= 20 && age < 30) {
					rate = (0.20 + 0.10);
					break;
				}
				else {
					rate = (0.15 + 0.10);
					break;
				}

			}

		}

		void moneyCal() {
			money = price - (int)(price * rate);
		}

		void dataPrint() {
			rateCal();
			moneyCal();
			System.out.println(movieName + "\t\t" + price + "\t\t" + age + "\t\t" + money);
		}

		void titlePrint() {
			System.out.println("영화명 \t\t 금액 \t\t 나이 \t\t 실구매가격");

		}

	}
	


