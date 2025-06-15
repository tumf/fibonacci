/// Calculates the Nth Fibonacci number.
///
/// # Arguments
///
/// * `n` - The index (non-negative integer, 0 <= n <= 92) of the desired Fibonacci number.
///
/// # Returns
///
/// * `Some(u64)` - The Nth Fibonacci number if input is valid
/// * `None` - If input is negative or greater than 92
pub fn fibonacci(n: i32) -> Option<u64> {
    if n < 0 || n > 92 {
        return None;
    }
    match n {
        0 => Some(0),
        1 => Some(1),
        _ => {
            let mut a: u64 = 0;
            let mut b: u64 = 1;
            for _ in 2..=n {
                let c = a.checked_add(b)?;
                a = b;
                b = c;
            }
            Some(b)
        }
    }
}
