 <h1>Real World E-commerce website</h1> 
 <h3>Project: Naptol Website</h3>

***
🛠️ __Technology Stack__ 
- __Automation Tool:__ Selenium WebDriver
- __Testing Framework:__ TestNG
- __Designe Pattren:__ Page Object Model (POM)
- __Programming Language:__ Java
- __Build Tool:__ MAven
- __Browser Automation:__ ChromeDriver
   
***
## 📌 Project Overview  
The main objective of this project is to perform **UI automation testing** on the Naaptol e-commerce website.  
It covers scenarios such as:  
- Homepage validation  
- Login/Logout functionality  
- Product search and navigation  
- Add to Cart and Checkout workflow  
- Error handling for invalid inputs  

***


## 📑 Table of Contents  
- Project Overview
- Technology Stack]
- How to Run the Tests
- Project Structure
- Future Enhancements
 


***

##  🚀 How to Run the Tests 

1. Clone the repository:
   ```bash
   git clone https://github.com/Yogesh36k/NaptolWebOnlinebuyproduct
.git
   cd NaptolWebOnlinebuyproduct
   ***

   ## ✨ Future Enhancements  

- Automate **Wishlist functionality** (add/remove products).  
- Cover **Compare Products feature** with different categories.  
- Automate **Checkout with multiple payment methods** (Credit Card, Net Banking, UPI, Cash on Delivery).  
- Implement **Order Tracking automation** after purchase.  
- Add validations for **Discounts, Coupons, and Offers**.  
- Enhance **Search functionality testing** (filters, price ranges, categories).  
- Automate **User Registration & Profile Management** scenarios.  
- Validate **Cart persistence** across sessions (login/logout).  
- Integrate with **Extent Reports & Allure Reports** for detailed results.  
- Run **Cross-browser & Mobile responsive tests** for Naaptol’s website.  
***
   ## 📂 Project Structure
   
```
|-- src
|   |-- main
|   |   |-- java
|   |   |   |-- pages              # Page Object Model classes
|   |   |   |-- utils              # Utility classes (e.g., WebDriver manager)
|   |-- test
|   |   |-- java
|   |   |   |-- testcases         # TestNG test cases
|   |-- resources
|       |-- extent-config.xml     # Configuration for Extent Reports
|-- test-output
|   |-- ExtentReports.html        # Generated test report
