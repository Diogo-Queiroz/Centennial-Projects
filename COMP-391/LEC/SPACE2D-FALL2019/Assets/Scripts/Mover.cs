using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.Serialization;

public class Mover : MonoBehaviour
{
    private Rigidbody2D _rigidbody2D;
    public float speed = 20.0f;
    // Start is called before the first frame update
    void Start()
    {
        _rigidbody2D = GetComponent<Rigidbody2D>();
        if (_rigidbody2D.tag.Equals("Laser"))
            _rigidbody2D.velocity = Vector2.right * speed;
        else if (_rigidbody2D.tag.Equals("Asteroid"))
            _rigidbody2D.velocity = Vector2.left * speed;
    }
}
