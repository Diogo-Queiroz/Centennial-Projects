using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace PartyEnvites.Models
{
    public class Repository
    {
        private static List<GuestReponse> responses = new List<GuestReponse>();

        public static IEnumerable<GuestReponse> Reponses
        {
            get
            {
                return responses;
            }
        }

        public static void AddReponse(GuestReponse response)
        {
            responses.Add(response);
        }
    }
}
