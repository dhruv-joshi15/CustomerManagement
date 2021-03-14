package com.cg.Assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cg.Assignment.customerms.ui.CustomerMain;
import com.cg.Assignment.itemms.ui.ItemmsUi;

@SpringBootApplication
	public class AssignmentApplication {
		public static void main(String[] args) {
			ConfigurableApplicationContext context=SpringApplication.run(AssignmentApplication.class, args);
			CustomerMain customerMain=context.getBean(CustomerMain.class);
			customerMain.start();
			ItemmsUi itemUI = context.getBean(ItemmsUi.class);
			itemUI.start();
		}
		



	
	}


