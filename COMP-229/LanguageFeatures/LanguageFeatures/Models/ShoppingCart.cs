﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace LanguageFeatures.Models
{
    public class ShoppingCart //: IEnumerable<Product>
    { 
        public IEnumerable<Product> Products { get; set; }

        /*public IEnumerable<Product> GetEnumerator()
        {
            return Products.GetEnumerator();
        }

        IEnumerator IEnumerable.GetEnumerator()
        {
            return GetEnumerator;
        }*/
    }
}
