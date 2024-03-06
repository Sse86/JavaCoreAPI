package Package1;

import java.time.LocalDate;

  class Dinosaur {
	
	private String name;
	private LocalDate birthday;
	
	 Dinosaur(String name,LocalDate birthday) {
		this.name = name;
		this.birthday = birthday;
	}
	
	 String getName() {
		return this.name;
		
	}
	 public void setName(String name) {
		this.name = name;
	}
	 LocalDate getBirthday() {
		return this.birthday;
	}
	public void  setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
	
	Dinosaur dino = new Dinosaur("Tyrannosaurs",LocalDate.of(2021, 03, 23));
}

	
	
	


