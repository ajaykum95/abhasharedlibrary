package com.abha.sharedlibrary.shared.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Industry {
  BUSINESS_SOFTWARE("Business Software (e.g., B2B SaaS, Enterprise Solutions)"),
  COACHING_SERVICES("Coaching Services or Programs (e.g., Courses, Personal Development, Community)"),
  CREATIVE_SERVICES("Creative Services (e.g., Digital Marketing, Branding, Advertising, Public Relations)"),
  SALES_AS_A_SERVICE("Sales as a Service (e.g., Outsourced Sales, Consulting, Lead Generation)"),
  PROFESSIONAL_SERVICES("Professional Services (e.g., Consulting, Legal, Accounting)"),
  FINANCIAL_SERVICES("Financial Services (e.g., Investment Management, Banking, Insurance)"),
  REAL_ESTATE("Real Estate (e.g., Property Development, Property Management, Real Estate Agencies)"),
  SPACE_RENTAL("Space rental or event services (e.g., Venue Rental, Event Planning)"),
  TRAVEL_SERVICES("Travel Services (e.g., Airlines, Hotels, Travel Agencies)"),
  RECRUITMENT_SERVICES("Recruitment Services (e.g., Staffing Agencies, Headhunting)"),
  ENERGY_SOLUTIONS("Energy Solutions (e.g., Oil and Gas, Renewable Energy)"),
  CONSTRUCTION_HOME_SERVICES("Construction or Home Services (e.g., Residential, Commercial, Contractors)"),
  MANUFACTURING("Manufacturing (e.g., Consumer Goods, Industrial Products, Automotive)"),
  LOGISTICS_SERVICES("Logistics Services (e.g., Shipping, Warehousing, Supply Chain Management)"),
  AGRICULTURAL_PRODUCTS("Agricultural Products (e.g., Farming, Livestock, Fishing)"),
  NONPROFIT_SERVICES("Nonprofit Services (e.g., Charities, Foundations)"),
  HEALTHCARE_SERVICES("Healthcare Services (e.g., Hospitals, Clinics, Pharmaceuticals, Medical Devices)"),
  EDUCATIONAL_SERVICES("Educational Services (e.g., Schools, Universities, Online Learning Platforms)"),
  CONSUMER_PRODUCTS("Consumer Products (e.g., Electronics, Clothing, Home Goods)"),
  FOOD_AND_BEVERAGE("Food and Beverage (e.g., Restaurants, Food Production, Beverage Companies)"),
  AUTOMOTIVE_SERVICES("Automotive Services (e.g., Repair Shops, Dealerships)"),
  TELECOM_PRODUCTS("Telecom Products (e.g., Mobile Phones, Internet Service Providers)"),
  OTHER("Other");

  private final String value;
}
