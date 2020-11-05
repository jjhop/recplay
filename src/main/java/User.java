import lombok.Getter;

public record User(
    @Getter Long id,
    @Getter String name) {
}
