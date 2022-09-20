package hmac;


import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 *
 * @author bkones
 */
public class Signature {

    public static void main(String[] args) {
//        System.out.println(generateSignature("6000125642", "5800", "060147734", "013847", "150711023355"));
        System.out.println(generateSignature("1037101893730", "10000", "060147734", "300147", "082316242500"));
//        System.out.println(generateSignature("1000295716", "8000", "060147733", "180147", "250711000002"));
        System.out.println(generateSignature("1252000015", "200000", "060147734", "180147", "090316242500"));
    }

    public static String generateSignature(String sourceAccount,
            String amount,
            String agentId,
            String bankSortCode,
            String referenceNumber) {

        // DecimalFormat df = new DecimalFormat("0.00");
        // String decimalPlaces = df.format(amount);
        String input = sourceAccount + "&" + amount + "&" + agentId + "&" + bankSortCode;

        byte[] secretKeyByteArray = referenceNumber.getBytes(StandardCharsets.UTF_8);
        String client_string = Base64.getEncoder().encodeToString(secretKeyByteArray);
        byte[] secretKey = client_string.getBytes(StandardCharsets.UTF_8);
        byte[] signature = input.getBytes(StandardCharsets.UTF_8);
        byte[] hmacSha256 = null;

        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey, "HmacSHA256");
            mac.init(secretKeySpec);
            hmacSha256 = mac.doFinal(signature);

        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
        return Base64.getEncoder().encodeToString(hmacSha256);
    }
}
