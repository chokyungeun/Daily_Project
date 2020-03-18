import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class 서울_2반_조경은_Day08_블록체인구현 {
	public static String prevhash, hash;
	public static int nonce;
	public static String getSha256(String str) {
		String SHA;
		try {
			MessageDigest sh = MessageDigest.getInstance("SHA-256");
			sh.update(str.getBytes());
			byte byteData[] = sh.digest();
			StringBuffer sb = new StringBuffer();
			for(byte aByteData : byteData) {
				sb.append(Integer.toString((aByteData & 0xff) + 0x100, 16).substring(1));
			}
			SHA = sb.toString();
		}catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
			SHA = null;
		}
		return SHA;
	}
	public static void main(String[] args) {
		System.out.println("nonce: 0");
		System.out.println("data: Genesis Block");
		System.out.println("prevhash: ");
		hash = getSha256("Genesis Block");
		System.out.println("hash: " + hash);
		System.out.println();
		prevhash = hash;
		for(int i=1; i<=2; i++) {
			nonce = 0;
			while(true) {
				String ph = hash;
				nonce++;
				hash = getSha256(ph);
				if(hash.substring(0, 5).equals("00000")) {
					break;
				}
			}
			System.out.println("nonce: " + nonce);
			System.out.println("data: " + (i+1) + "nd");
			System.out.println("prevhash: " + prevhash);
			System.out.println("hash: " + hash);
			prevhash = hash;
			System.out.println();
		}
	}

}
