public class ShortcutTableAndQuestion {
//         | Type              | Lambda                              | Method Reference              |
// | ----------------- | ----------------------------------- | ----------------------------- |
// | Static Method     | `s -> Integer.parseInt(s)`          | `Integer::parseInt`           |
// | Particular Object | `s -> printer.print(s)`             | `printer::print`              |
// | Arbitrary Object  | `(a,b) -> a.compareToIgnoreCase(b)` | `String::compareToIgnoreCase` |
// | Constructor       | `() -> new Student()`               | `Student::new`                |


// Agar interviewer pooche:

// Method Reference kab use kar sakte hain?

// To answer hoga:

// Jab lambda expression sirf kisi existing method ya constructor ko call kar raha ho aur usme koi extra logic na ho, tab us lambda ko Method Reference (::) se replace kiya ja sakta hai.

}
