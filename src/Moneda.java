import java.util.ArrayList;

public record Moneda(String base_code,
                     String time_last_update_utc,
                     Valores conversion_rates) {
}
