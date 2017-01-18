package decorator;

import java.io.BufferedReader;
import java.io.IOException;

public class DecoratorEntschlüsselung {

	BufferedReader br;
	int key;

	public DecoratorEntschlüsselung(BufferedReader br, int key) {
		this.br = br;
		this.key = key;
	}
	
	public String read() throws IOException {
		String tmp = br.readLine();
		if (tmp == null) {
			return tmp;
		} else {
			char[] c = tmp.toCharArray();
			for (int i = 0; i < c.length; i++) {
				c[i] = (char) (c[i] - key);
			}
			return new String(c);
		}}

	public void close() throws IOException {

		br.close();}
}
