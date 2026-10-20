def fix_names(df: pd.DataFrame) -> pd.DataFrame:
    df['name'] = df['name'].str.capitalize()
    return df.sort_values('user_id')