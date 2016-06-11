package polina;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serializer {

	public Serializer() {
	
	}
	
	public static byte[] toByteArrayShort(int obj) throws IOException {
        byte[] bytes = null;
        ByteArrayOutputStream bos = null;
        DataOutputStream dos = null;
        try {
            bos = new ByteArrayOutputStream();
            dos = new DataOutputStream(bos);
            dos.writeShort(obj);
            dos.flush();
            bytes = bos.toByteArray();
        } finally {
            if (dos != null) {
                dos.close();
            }
            if (bos != null) {
                bos.close();
            }
        }
        return bytes;
    }
	
	public static byte[] toByteArrayString(String obj) throws IOException {
        byte[] bytes = null;
        ByteArrayOutputStream bos = null;
        DataOutputStream dos = null;
        try {
            bos = new ByteArrayOutputStream();
            dos = new DataOutputStream(bos);
            dos.writeBytes(obj);
            dos.flush();
            bytes = bos.toByteArray();
        } finally {
            if (dos != null) {
                dos.close();
            }
            if (bos != null) {
                bos.close();
            }
        }
        return bytes;
    }
	
	public static byte[] toByteArrayInt(Integer obj) throws IOException {
		byte[] bytes = null;
		ByteArrayOutputStream bos = null;
		DataOutputStream dos = null;
		try {
			bos = new ByteArrayOutputStream();
			dos = new DataOutputStream(bos);
			dos.writeInt(obj);
			dos.flush();
			bytes = bos.toByteArray();
		} finally {
			if (dos != null) {
				dos.close();
			}
			if (bos != null) {
				bos.close();
			}
		}
		return bytes;
	}
	
	public static byte[] toByteArrayBool(Boolean obj) throws IOException {
		byte[] bytes = null;
		ByteArrayOutputStream bos = null;
		DataOutputStream dos = null;
		try {
			bos = new ByteArrayOutputStream();
			dos = new DataOutputStream(bos);
			dos.writeBoolean(obj);
			dos.flush();
			bytes = bos.toByteArray();
		} finally {
			if (dos != null) {
				dos.close();
			}
			if (bos != null) {
				bos.close();
			}
		}
		return bytes;
	}
	
	public static short toShortByteArray(byte[] obj) throws IOException {
        short bytes;
        ByteArrayInputStream bis = null;
        DataInputStream dis = null;
        try {
            bis = new ByteArrayInputStream(obj);
            dis = new DataInputStream(bis);
            bytes = dis.readShort();
        } finally {
            if (dis != null) {
                dis.close();
            }
            if (bis != null) {
                bis.close();
            }
        }
        return bytes;
    }
	
	@SuppressWarnings("deprecation")
	public static String toStringByteArray(byte[] obj) throws IOException {
        String bytes = null;
        ByteArrayInputStream bis = null;
        DataInputStream dis = null;
        try {
            bis = new ByteArrayInputStream(obj);
            dis = new DataInputStream(bis);
            bytes = dis.readLine();
        } finally {
            if (dis != null) {
                dis.close();
            }
            if (bis != null) {
                bis.close();
            }
        }
        return bytes;
    }
	
	public static int toIntByteArray(byte[] obj) throws IOException {
		int bytes;
		ByteArrayInputStream bis = null;
        DataInputStream dis = null;
		try {
			bis = new ByteArrayInputStream(obj);
            dis = new DataInputStream(bis);
			bytes = dis.readInt();
		} finally {
			if (dis != null) {
				dis.close();
			}
			if (bis != null) {
				bis.close();
			}
		}
		return bytes;
	}
	
	public static boolean toBoolByteArray(byte[] obj) throws IOException {
		boolean bytes;
		ByteArrayInputStream bis = null;
        DataInputStream dis = null;
		try {
			bis = new ByteArrayInputStream(obj);
            dis = new DataInputStream(bis);
			bytes = dis.readBoolean();
		} finally {
			if (dis != null) {
				dis.close();
			}
			if (bis != null) {
				bis.close();
			}
		}
		return bytes;
	}

	
	public static byte[] serialize(Object obj) throws IOException {
		ByteArrayOutputStream b = new ByteArrayOutputStream();
		DataOutputStream o = new DataOutputStream(b);
		o.writeShort((int) obj);
		return b.toByteArray();
	}
	
	public static Object deserialize(byte[] bytes) throws IOException, ClassNotFoundException {
		ByteArrayInputStream b = new ByteArrayInputStream(bytes);
		ObjectInputStream o = new ObjectInputStream(b);
		return o.readObject();
	}

	public static byte[] toByteArrayChar(String obj) throws IOException {
		byte[] bytes = null;
		ByteArrayOutputStream bos = null;
		DataOutputStream dos = null;
		try {
			bos = new ByteArrayOutputStream();
			dos = new DataOutputStream(bos);
			dos.writeBytes(obj);
			dos.flush();
			bytes = bos.toByteArray();
		} finally {
			if (dos != null) {
				dos.close();
			}
			if (bos != null) {
				bos.close();
			}
		}
		return bytes;
	}

	
}
