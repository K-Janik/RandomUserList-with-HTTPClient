export interface PersonInfo{
  first_name: string;
  last_name: string;
  username: string;
  email: string;
  phone_number: string;
  social_insurance_number: string;
  employment: Employment;
}

export interface Employment {
  title: string;
  key_skill: string;
}
