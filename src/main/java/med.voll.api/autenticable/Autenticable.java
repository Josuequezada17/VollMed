package med.voll.api.autenticable;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public interface Autenticable extends UserDetails {
}