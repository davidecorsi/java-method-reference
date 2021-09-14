import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
/*
 * I method reference possono essere applicati a 4 tipi di metodo
 */
public class Main {
	public static void main(String[] args) {
		Consumer<String> consumer1 = s -> System.out.println(s);
		// metodi statici
		Consumer<String> consumer2 = System.out::println;
		
		class Example {
			public Example() {
				
			}
			public Example(Integer integer) {
				
			}
		}
		Supplier<Example> supplier1 = () -> new Example();
		// costruttore senza argomenti
		Supplier<Example> supplier2 = Example::new;
		
		Function<Integer, Example> function1 = integer -> new Example(integer);
		// costruttore con argomento
		Function<Integer, Example> function2 = Example::new;
		
		Function<String, String> supplier3 = s -> s.toLowerCase();
		// metodo di istanza del tipo di oggetto
		Function<String, String> supplier4 = String::toLowerCase;
		
		Integer integer = 10;
		Supplier<String> supplier5 = () -> integer.toString();
		// metodo di istanza di un oggetto specifico
		Supplier<String> supplier6 = integer::toString;
	}
}
