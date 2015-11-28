package co.edu.udea.appempresariales.examples;

public class CodeBreaker {
	private String secret;

	public StringBuffer test(StringBuffer test) {
		StringBuffer secretAux = new StringBuffer(secret);
		System.out.println(secret);
		StringBuffer equis = new StringBuffer("");
		StringBuffer guion = new StringBuffer("");
		if (test.length() != secretAux.length()) {
			return new StringBuffer("Ingrese un numero con la cantidad correcta de digitos");
		}
		if (test.equals(secretAux)) {
			return new StringBuffer("xxxx");
		}
		for (int i = 0; i < secretAux.length(); i++) {
			char c = secretAux.charAt(i);
			for (int j = 0; j < test.length(); j++) {
				char s = test.charAt(j);
				if (s == c & j == i) {
					equis.append("x");
					test.setCharAt(j, '-');
					secretAux.setCharAt(i, '.');
					break;
				} else {
					if (s == c) {
						guion.append("_");
						test.setCharAt(j, '-');
						break;
					}
				}
			}
		}
		return equis.append(guion);

	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

}
