package P1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_saqqa {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver =new EdgeDriver();
	driver.get("");

}}
