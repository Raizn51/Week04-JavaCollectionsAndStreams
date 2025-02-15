package com.tit.day05javaragexandjunit.javaragex.basicregexproblems.validatehexcolorcode;

import java.util.regex.Pattern;

/*
 * 3️⃣ Validate a Hex Color Code
 * 💡 Problem Statement:
 * A valid hex color:
 * - Starts with a #
 * - Followed by 6 hexadecimal characters (0-9, A-F, a-f).
 *
 * 🔹 Example Inputs & Outputs
 * ✅ "#FFA500" → Valid
 * ✅ "#ff4500" → Valid
 * ❌ "#123" → Invalid (too short)
 */

// Creating a class HexColorValidationSimulation to demonstrate hex color code validation
public class HexColorValidationSimulation {
    public static void main(String[] args) {
        // Example hex color codes for testing
        String[] hexColors = {"#FFA500", "#ff4500", "#123", "#ABCDEF"};

        // Validate each hex color code and print whether it is valid or invalid
        for (String hexColor : hexColors) {
            if (HexColorValidator.isValidHexColor(hexColor)) {
                System.out.println(hexColor + " → Valid");
            } else {
                System.out.println(hexColor + " → Invalid");
            }
        }
    }
}
