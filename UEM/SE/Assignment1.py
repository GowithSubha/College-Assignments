def calculate_fp():
    # Given data
    num_fp = {
        'i/p': 60,
        'file': 25,
        'query': 35,
        'i/f': 20,
        'o/p': 25
    }

    ratio_fp = {
        'i/p': (1, 6, 3),
        'file': (1, 2, 2),
        'query': (0, 1, 0),  # avg.
        'i/f': (0, 0, 1),  # complex
        'o/p': (2, 2, 1)
    }

    weight_factors = (0.5, 1.0, 1.5)
    reliability = 0.65
    complexity = 0.75

    # Calculate UFP
    ufp = 0
    for fp_type, num in num_fp.items():
        ratios = ratio_fp[fp_type]
        for i in range(3):  # 3 because we have simple, avg, complex
            ufp += num * ratios[i] * weight_factors[i]

    # Calculate TDI
    tdi = reliability * complexity

    # Calculate VAF
    vaf = 0.65 + (0.01 * tdi)

    # Calculate AFP
    afp = ufp * vaf

    return ufp, tdi, vaf, afp


# Main function to display the result
if __name__ == "__main__":
    ufp, tdi, vaf, afp = calculate_fp()
    print(f"UFP: {ufp}")
    print(f"TDI: {tdi}")
    print(f"VAF: {vaf}")
    print(f"AFP: {afp}")