package password_checker

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should._

class Password_Test extends AnyFunSpec with Matchers {
    describe("A password checker") {
        describe("determines proper length") {
            it("rejects passwords that are less than 6 characters") {
                val tooShort = "abcde"
                val longEnough = "abcdef"
                val evenLonger = "abcdefghi"
                
                Password.isValid(tooShort) shouldBe false
                Password.isValid(longEnough) shouldBe true
                Password.isValid(evenLonger) shouldBe true
                

            }
        }
    }
}

class Password_Cap_Test extends AnyFunSpec with Matchers {
    describe("Detirmines if a capital char is present"){
        it("rejects passwords that have >1 capital chars"){
            val capitalpass = "Abcdef"
            val capitalNopass = "abcde"

            Password.containsCap(capitalpass) shouldBe true
            Password.containsCap(capitalNopass) shouldBe false
        }
    }
}