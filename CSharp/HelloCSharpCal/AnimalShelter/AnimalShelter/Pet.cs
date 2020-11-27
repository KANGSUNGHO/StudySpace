using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AnimalShelter
{
    public class Pet
    {
        public int PetId;
        public string Name;
        public string Color;
        public string Gender;
        public string Description;

        public Pet(int petId, string name, string color, string gender)
        {
            this.PetId = petId;
            this.Name = name;
            this.Color = color;
            this.Gender = gender;
        }

        public virtual string MakeSound() // virtual 키워드는 가상메서드, 자식클래스에서 재정의된 메소드가 존재하면 그것을 호출함.
        {
            return "";
        }
    }
}
