#  dafault parameter
# key value argument 
#  more than one argument  *name , ye return karta hai tuple 
#   **name , ye return karta hai dictionary , keyvalue pairs me dena hai yisko 


# def greet_name(name , age = 18 ,  country = "india",**additional ): 
#     print(f"hello kaise ho {name} {age} {additional} {country}  ")



# greet_name("bame", "pak " , interest="developnemnt" , hobby="cricket",course="python"  )




# def greet_name(name , age = 18 ,  country = "india",**additional ): 
#     print(f"hello kaise ho {name} {age} {additional} {country}  ")



# greet_name("bame", "pak " , interest="developnemnt" , hobby="cricket",course="python"  )


# def employee_details(name , age = 18 ,*skills,**additional ):
#     # print(f"hello kaise ho {name} {age} {additional}   ")
#     print("name " +name)
#     print("age :" + str(age))
     
#     print("Skills")
#     for skill  in skills: 
#         print(f"--> {skill}")
    
#     print("additional")
#     for key , value in additional.items():
#         print(f"{key} : {value}")


# employee_details("rakesh" , 16 ,"python" , "java", "running" ,interest = "developnemnt" , hobby="cricket",course="python"  , calss = "10" )


# ! this will not work 
# def employee_details(name , age = 18 ,**additional , *skills ):
#     # print(f"hello kaise ho {name} {age} {additional}   ")
#     print("name " +name)
#     print("age :" + str(age))
     
#     print("Skills")
#     for skill  in skills: 
#         print(f"--> {skill}")
    
#     print("additional")
#     for key , value in additional.items():
#         print(f"{key} : {value}")


# employee_details("rakesh" , 16  ,interest = "developnemnt" , hobby="cricket",course="python"  , calss = "10"  ,"python" , "java", "running" )


# employee_details = lambda name, age=18, *skills, **additional: (
#     print(f"name: {name}"),
#     print(f"age: {age}"),
#     print("Skills"),
#     print("\n".join(f"--> {skill}" for skill in skills)),
#     print("additional"),
#     print("\n".join(f"{key}: {value}" for key, value in additional.items()))
# )

# employee_details("rakesh", 23, "python", "java", "running", interest="development", hobby="cricket", course="python", class_="10")


# ! doc string

# def employee_details(name, age=18, *skills, **additional):
#     """
#     Prints employee details.

#     Parameters:
#     name (str): Employee name
#     age (int): Employee age (default: 18)
#     *skills (str): Employee skills
#     **additional (dict): Additional employee information (e.g. interest, hobby, course, class)

#     Returns:
#     None
#     """
#     print(f"name: {name}")
#     print(f"age: {age}")
#     print("Skills")
#     print("\n".join(f"--> {skill}" for skill in skills))
#     print("additional")
#     print("\n".join(f"{key}: {value}" for key, value in additional.items()))

# employee_details("rakesh", 23, "python", "java", "running", interest="development", hobby="cricket", course="python", class_="10")

# print(employee_details.__doc__)

#  [2,3,4]

#  [4,9,16]

#  mathplotlib , numpy ,   pandas , seaborn , scikit-learn ,scipy  