import Logo from '../../assets/img-marketpay.svg';
import { Input } from "@/components/ui/input";
import { Label } from "@/components/ui/label";
import { Button } from "@/components/ui/button";

export function Login() {
    return (
        <div className="flex bg-[#363b3d] justify-center items-center h-dvh">
            <div className="flex bg-white w-full max-w-4xl rounded-md">
                <img src={Logo} alt="logo-market-pay" className='h-* rounded-l-md' />
                <div className='flex flex-col justify-center w-full p-8 gap-6'>
                    <div className='text-center w-full'>
                        <Label className='text-3xl font-bold'>Bem-vindo (a) ao MarketPay!</Label>
                    </div>
                    <div className='flex flex-col gap-1'>
                        <Label htmlFor='email'>Email</Label>
                        <Input type='email' placeholder='Informe seu E-mail' />
                    </div>
                    <div className='flex flex-col gap-1'>
                        <Label htmlFor='password'>Senha</Label>
                        <Input type='password' placeholder='Informe sua Senha' />
                    </div>
                    <Button className='bg-[#45cfef] hover:bg-[#4abfdb] w-full cursor-pointer'>Entrar</Button>
                </div>
            </div>
        </div>
    );
}