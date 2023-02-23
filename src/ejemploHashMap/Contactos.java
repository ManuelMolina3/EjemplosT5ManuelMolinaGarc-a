package ejemploHashMap;

import java.util.Objects;

public class Contactos {

	private int idContacto;
	private String nombre;
	private String correo;

	public Contactos(int idContacto, String nombre, String correo) {
		super();
		this.idContacto = idContacto;
		this.nombre = nombre;
		this.correo = correo;
	}

	public int getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Contactos [idContacto=" + idContacto + ", nombre=" + nombre + ", correo=" + correo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(correo, idContacto, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contactos other = (Contactos) obj;
		return Objects.equals(correo, other.correo) && idContacto == other.idContacto
				&& Objects.equals(nombre, other.nombre);
	}

}
