package com.abha.sharedlibrary.shared.enums;

/**
 * Enum representing different types of addresses.
 * This enum is used to classify addresses based on their usage, such as:
 * - HOME: A residential address.
 * - OFFICE: An official or workplace address.
 * - WORK: A general work-related address.
 * - OTHER: Any other type of address that does not fit into the above categories.
 */
public enum AddressType {
  HOME,           // Personal residence
  OFFICE,         // Workplace or business office
  BUSINESS,       // Business or company address
  BILLING,        // Address for invoicing and payments
  SHIPPING,       // Delivery or shipping address
  REGISTERED,     // Registered business address
  WAREHOUSE,      // Storage or warehouse location
  FACTORY,        // Manufacturing unit or factory address
  BRANCH,         // Branch office location
  HEADQUARTERS,   // Main corporate office
  PERMANENT,      // Long-term residence address
  TEMPORARY,      // Short-term or temporary address
  CORRESPONDENCE, // Address for receiving official communication
  LEGAL,          // Address for legal documentation
  CLIENT,         // Client's business or residential address
  VENDOR,         // Vendor or supplier address
  OTHER           // Any other unspecified type
}
