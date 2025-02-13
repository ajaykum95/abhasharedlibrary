package com.abha.sharedlibrary.shared.constants;

import java.util.List;

/**
 * A class that contains constant values for HTTP headers.
 * This class defines header keys used for user authentication
 * and client identification across the application.
 */
public class HeaderConstant {
  public static final String USER_ID = "x-user-id";
  public static final String CLIENT_ID = "x-client-id";
  public static final List<String> CLIENT_ALLOWED = List.of("aums", "doms", "enms", "pams", "atms");
}
