package com.insee.vistiplanning.enums;

import java.util.HashMap;
import java.util.Map;

public enum CategoryType {

  FOCUS("Focus"), HUNTING("Hunting"),
  FARMING("Farming"), SMALL("Small"),
  HOT_TARGET("Hot Target"), STANDARD_TARGET("Standard Target"),
  NO_TARGET("No Target");

  private String category;

  CategoryType(String category) {
    this.category = category;
  }

  public String getCategory() {
    return category;
  }

  private static final Map<String, CategoryType> lookUp = new HashMap<>();

  static {
    for (CategoryType env : CategoryType.values()) {
      lookUp.put(env.getCategory(), env);
    }
  }

  public static CategoryType get(String categoryAsString) {
    CategoryType categoryType = lookUp.get(categoryAsString);
    if (categoryType == null) {
      throw new IllegalArgumentException(categoryAsString + "Category type is not valid");
    }
    return categoryType;
  }
}
