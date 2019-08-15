package mySun;

import org.springframework.stereotype.Service;

	@Service("helloWorldService")
	public class Hello {
	 
		private String name;
		 
		public void setName(String name) {
			this.name = name;
		}
	 
		public String sayHello() {
			return "Hello! " + name;
		}
	}

